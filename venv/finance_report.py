import mysql.connector
from mysql.connector import errorcode

config = {
    "user": "Wilson",  # root
    "password": "admin",  # root_password
    "host": "127.0.0.1",
    "database":"Finance",
    "raise_on_warnings": True
}

try:
    db = mysql.connector.connect(**config)

    cursor = db.cursor()
    print("Average Asset Value")
    cursor.execute("select sum(transaction_amount) / count(distinct customer_id) from transaction_table;")
    rows=cursor.fetchall()
    for row in rows:
        for col in row:
            print(col,end=" ")
        print()

    # Close connection
    db.close()


except mysql.connector.Error as err:
    if err.errno == errorcode.ER_ACCESS_DENIED_ERROR:
        print("  The supplied username or password is invalid")

    elif err.errno == errorcode.ER_ACCESS_DENIED_ERROR:
        print("  The specified database does not exist")

    else:
        print(err)

finally:
    db.close()