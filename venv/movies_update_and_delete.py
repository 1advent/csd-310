import mysql.connector
from mysql.connector import errorcode

config = {
    "user": "movies_user",
    "password": "popcorn",
    "host": "127.0.0.1",
    "database": "movies",
    "raise_on_warnings": True
}
try:
    db = mysql.connector.connect(**config)

    #print("\n Database user {} connected to MySQL on host {} with database {}".format(config["user"], config["host"], config["database"]))
    #first the studio
    cursor = db.cursor()

    def show_films(cursor,title):
        cursor.execute("SELECT film_name as Name, film_director as Director, genre_name as Genre, studio_name as 'Studo Name' from film INNER JOIN genre ON film.genre_id=genre.genre_id INNER JOIN studio on film.studio_id = studio.studio_id;")
        films = cursor.fetchall()

        print("\n --{} --".format(title))

        for film in films:
            print("Film Name: {}\nDirector: {}\nGenre Name ID: {}\nStudio Name: {}\n".format(film[0], film[1], film[2], film[3]))

    def insert_film(cursor):
        cursor.execute("insert into film (film_name, film_releaseDate, film_runtime, film_director, studio_id, genre_id) VALUES('The Purge', '2013', '85', 'James DeMonaco', '2', '1');")
    def update_genre(cursor):
        cursor.execute("update film set genre_id=1 where film_name='Alien';")
    def delete_film(cursor):
        cursor.execute("delete from film where film_name='Gladiator';")

    #I know this isn't part of the requirements, but I have this here so I don't have to keep reloading the init file.
    def revert_films(cursor):
        cursor.execute("delete from film where film_name='The Purge';")
        cursor.execute("update film set genre_id=2 where film_name='Alien';")
        cursor.execute("insert into film (film_name, film_releaseDate, film_runtime, film_director, studio_id, genre_id) VALUES('Gladiator', '2000', '115', 'Ridley Scott', '3', '3');")


    show_films(cursor,"DISPLAYING FILMS")
    insert_film(cursor)
    show_films(cursor,"DISPLAYING FILMS AFTER INSERT")
    update_genre(cursor)
    show_films(cursor,"DISPLAYING FILMS AFTER UPDATE - CHANGED Alien to Horror")
    delete_film(cursor)
    show_films(cursor,"DISPLAYING FILMS AFTER DELETE")

    #my revert changes section:
    revert_films(cursor)


except mysql.connector.Error as err:
    if err.errno == errorcode.ER_ACCESS_DENIED_ERROR:
        print("  The supplied username or password is invalid")

    elif err.errno == errorcode.ER_ACCESS_DENIED_ERROR:
        print("  The specified database does not exist")

    else:
        print(err)

finally:
    db.close()