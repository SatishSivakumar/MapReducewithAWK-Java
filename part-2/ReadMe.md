
•	Java and MySQL server should be installed with the JDBC connection. The all folder under the home directory should contain all the dataset gzip files. 

•	Move the creatingDB.sh that is in the part-2 folder in to the vagrant box. Execute this shell script code using “.creatingDB.sh” command. After executing the command, it prompts you to enter the password for the DB which is “safestsystemever”. After this step, a database connection will be established and there will be three tables created, “scenarioone”,”scenariotwo”,”scenariothree”.

•	After completing this step, move the insertTable.java java function to the vagrant box and compile the code. This program will insert the data into tables “scenarioone”,”scenariotwo”,”scenariothree” from the datasets 1990.gz, 1990.gz and 1991.gz,1990.gz and 1991.gz and 1992.gz and 1993.gz respectively.

•	Next to execute the scenario one , run the scenarioone.java code by moving it to the vagrant box. This will print the maximum temperature of the year 1990.

•	Next to execute the scenario two , run the scenariotwo.java code by moving it to the vagrant box. This will print the maximum temperature of the year 1990 and 1992.

•	Next to execute the scenario three , run the scenariothree.java code by moving it to the vagrant box. This will print the maximum temperature of the year 1990,1991,1992and 1993.

