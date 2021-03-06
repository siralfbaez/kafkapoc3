APACHE KAFKA QUICK POC
...

![](src/main/imgs/k1.png)

APACHE KAFKA
More than 80% of all Fortune 100 companies trust, and use Kafka.

Apache Kafka is an open-source distributed event streaming platform used by thousands of companies for high-performance data pipelines, streaming analytics, data integration, and mission-critical applications.
...
![](src/main/imgs/k2.png)
more content coming soon!
On this quick POC we write produce 30 million messages under
3 minutes. Soon I'll share my Mac's specs
![](src/main/imgs/k30mil.png)

Mac-book Pro M1 chip
![](src/main/imgs/Mac-M1-chip1.png)

QUICK REST API TO CONSUME APACHE KAFKA MESSAGES

![](src/main/imgs/k-quick-rest-api-1.png)

EXAMPLES:
``` aidl
###
POST http://localhost:8080/api/v1/messages
Content-Type: application/json

{
  "message": "Hooray URimagination - SirAlf!"
}

###
GET /hello

###
POST http://localhost:8080/api/v1/messages
Content-Type: application/json

{
  "message": "API rest call to Kafka"
}
```
Converted String message to Json Object message

![](src/main/imgs/k-Json-Object1.png)