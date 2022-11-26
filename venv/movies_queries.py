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
    cursor.execute("SELECT * FROM studio;")
    studios = cursor.fetchall()
    print("-- DISPLAYING Studio RECORDS --")
    for studio in studios:
        print("Studio ID: {}\nStudio Name: {}".format(studio[0], studio[1]))


    #second the genre
    cursor.execute("SELECT * FROM genre;")
    genres = cursor.fetchall()
    print("\n-- DISPLAYING Genre RECORDS --")
    for genre in genres:
        print("Genre ID: {}\nGenre Name: {}".format(genre[0], genre[1]))

    #third the film_runtime
    cursor.execute("SELECT film_name, film_runtime FROM film WHERE film_runtime < 120;")
    films = cursor.fetchall()
    print("\n-- DISPLAYING Short Film RECORDS --")
    for film in films:
        print("Film Name: {}\nRuntime: {}".format(film[0], film[1]))

    #forth the directors
    cursor.execute("SELECT any_value(film_name), film_director FROM film GROUP BY film_director;")
    directors = cursor.fetchall()
    print("\n-- DISPLAYING Director RECORDS in Order --")
    for director in directors:
        print("Film Name: {}\nDirector: {}".format(director[0], director[1]))

except mysql.connector.Error as err:
    if err.errno == errorcode.ER_ACCESS_DENIED_ERROR:
        print("  The supplied username or password is invalid")

    elif err.errno == errorcode.ER_ACCESS_DENIED_ERROR:
        print("  The specified database does not exist")

    else:
        print(err)

finally:
    db.close()