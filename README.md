# spring-boot-kafka-consumer
Springboot kafka application that consumes kafka messages

Requirements 
Kafka Should be installed up and running on your machine as well s Zookeeper

Instructions

1. Clone project and import it into your workspace and run as Springboot Application.

2. Open temnal and setup kafka topic "Kafka_Example_jsons" as below
kafka-console-producer --broker-list [YourMachinesLocalIp]:9092 --topic Kafka_Example_jsons

3. You can now send a json message like below and expect to see the message in your ide's console.

{"name":"David","dept":"Software"}







