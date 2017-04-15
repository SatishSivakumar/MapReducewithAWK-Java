#!/bin/bash

mysql -u root -p -e "create database maxtempAnalysis";
mysql --user='root' --password='safestsystemever' maxtempAnalysis << EOF
create table scenarioone (year VARCHAR(10), temperature INT(10),stationID INT(10),wabnID INT(10),month INT(10) ,date  INT(10),observHour  INT(10),latitude INT(10),longitude INT(10),elevationMetrics INT(10),windDirection VARCHAR(10),visibilityDistance INT(10),atmPressure INT(10));
create table scenariotwo (year VARCHAR(10), temperature INT(10),stationID INT(10),wabnID INT(10),month INT(10) ,date  INT(10),observHour  INT(10),latitude INT(10),longitude INT(10),elevationMetrics INT(10),windDirection VARCHAR(10),visibilityDistance INT(10),atmPressure INT(10));
create table scenariothree (year VARCHAR(10), temperature INT(10),stationID INT(10),wabnID INT(10),month INT(10) ,date  INT(10),observHour  INT(10),latitude INT(10),longitude INT(10),elevationMetrics INT(10),windDirection VARCHAR(10),visibilityDistance INT(10),atmPressure INT(10));
commit;
EOF
