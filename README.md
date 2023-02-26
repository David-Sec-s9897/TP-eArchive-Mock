## TP eArchive Mock service

[SpringBoot](http://projects.spring.io/spring-boot/) RESTful web service application with [Docker](https://www.docker.com/) and with [Kubernetes](https://kubernetes.io/)

#### Prerequisite

Installed:   
[Docker](https://www.docker.com/)   
[GIT](https://www.digitalocean.com/community/tutorials/how-to-contribute-to-open-source-getting-started-with-git)

Optional:   
[Docker-Compose](https://docs.docker.com/compose/install/)   
[Java 17](https://www.oracle.com/technetwork/java/javase/overview/index.html)   
[Maven 3.x](https://maven.apache.org/install.html)

#### Steps

##### Clone source code from git

```
git clone https://github.com/David-Sec-s9897/TP-eArchive-Mock.git .
```

##### Build Docker image

```
docker build -t="tp-earchive-mock" .
```

Maven build will be executes during creation of the docker image.

> Note:if you run this command for first time it will take some time in order to download base image from [DockerHub](https://hub.docker.com/)

##### Run Docker Container

```
docker run -p 8280:8280 -it --rm tp-earchive-mock
```

##### Test application

```
curl -X POST \
  http://localhost:8280/services/earchive.rest/documents \
  -H 'accept: application/json' \
  -H 'content-type: application/json' \
  -d '{"document":{"documentInfo":{"dossierName":"13.1.B - Countertrading - CH FR/silo:33674:448152:202302220000/1/2023-02-22T01-00-22","process":"Transparenzdaten bereitstellen","filename":"tsDocument.xml","fileExtension":"xml","function":"Market Operations","securityClassification":"Internal","record":"Zeitreihe - divers TP","dossierID":"9bb1bbd6d5ea180c9a880ee19ac44c1b","documentID":"silo:33674:448152:202302220000-1","dateTimeA":"2023-02-22T01:00:22Z","recordSeries":"Zeitreihendaten TP","dataOwner":"Data Management"},"content":"PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0idXRmLTgiPz48dHNEb2N1bWVudCB4bWxuczp4c2Q9Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvWE1MU2NoZW1hIiB4bWxuczp4c2k9Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvWE1MU2NoZW1hLWluc3RhbmNlIj48cGVyaW9kLnRpbWVJbnRlcnZhbD48c3RhcnQ+MjAyMy0wMi0yMlQwMDowMFo8L3N0YXJ0PjxlbmQ+MjAyMy0wMi0yMlQwMTowMFo8L2VuZD48L3BlcmlvZC50aW1lSW50ZXJ2YWw+PHJldmlzaW9uTnVtYmVyPjEuMC4wPC9yZXZpc2lvbk51bWJlcj48dGltZVNlcmllcz48aWQ+c2lsbzozMzY3NDo0NDgxNTI6Q2FsYzwvaWQ+PGRpbWVuc2lvbnM+PGF0dHJpYnV0ZSBuYW1lPSJhYmZyYWdlaWQiPjx2YWx1ZSB0eXBlPSJJbnRlZ2VyIiB2YWx1ZT0iMzM2NzQiLz48L2F0dHJpYnV0ZT48YXR0cmlidXRlIG5hbWU9ImFiZnJhZ2VCZXNjaHJlaWJ1bmciPjx2YWx1ZSB0eXBlPSJTdHJpbmciIHZhbHVlPSJbMTMuMS5CXV9DT1VOVEVSVFJBRElOR19bUFQ2ME1dIi8+PC9hdHRyaWJ1dGU+PGF0dHJpYnV0ZSBuYW1lPSJhYmZyYWdlQ29kZSI+PHZhbHVlIHR5cGU9IlN0cmluZyIvPjwvYXR0cmlidXRlPjxhdHRyaWJ1dGUgbmFtZT0iYWJmcmFnZU5hbWUiPjx2YWx1ZSB0eXBlPSJTdHJpbmciIHZhbHVlPSJbMTMuMS5CXV9DT1VOVEVSVFJBRElORyIvPjwvYXR0cmlidXRlPjxhdHRyaWJ1dGUgbmFtZT0iYWJmcmFnZVR5cCI+PHZhbHVlIHR5cGU9IlN0cmluZyIgdmFsdWU9IkNPTkdFU1RJT04gTUFOQUdFTUVOVCIvPjwvYXR0cmlidXRlPjxhdHRyaWJ1dGUgbmFtZT0iRGF0ZW5xdWVsbGUiPjx2YWx1ZSB0eXBlPSJTdHJpbmciLz48L2F0dHJpYnV0ZT48YXR0cmlidXRlIG5hbWU9Ik5ldHpiZXRyaWVic3BsYW51bmciPjx2YWx1ZSB0eXBlPSJJbnRlZ2VyIiB2YWx1ZT0iMCIvPjwvYXR0cmlidXRlPjxhdHRyaWJ1dGUgbmFtZT0iQmlsYW56ZmFrdG9yIj48dmFsdWUgdHlwZT0iWmVpdHdlcnRlIj48SXRlbSBLZXk9IjAiIG5hbWU9ImZyb20iIHR5cGU9IkRhdHVtWmVpdCIgVmFsdWU9IjE5OTAtMDEtMDFUMDA6MDA6MDAuMDAwIi8+PEl0ZW0gS2V5PSIwIiBuYW1lPSJmYWN0b3IiIHR5cGU9IkZsb2F0IiBWYWx1ZT0iMSIvPjxJdGVtIEtleT0iMCIgbmFtZT0iY29uc3RhbnQiIHR5cGU9IlN0cmluZyIgVmFsdWU9IjAiLz48L3ZhbHVlPjwvYXR0cmlidXRlPjxhdHRyaWJ1dGUgbmFtZT0iWmVpdHJlaWhlbnF1YWxpdMOkdCI+PHZhbHVlIHR5cGU9Ik5vdGl6VW5mb3JtYXRpZXJ0Ii8+PC9hdHRyaWJ1dGU+PGF0dHJpYnV0ZSBuYW1lPSJEYXRhTWFuYWdlciI+PHZhbHVlIHR5cGU9IlN0cmluZyIvPjwvYXR0cmlidXRlPjxhdHRyaWJ1dGUgbmFtZT0iRGF0YU93bmVyIj48dmFsdWUgdHlwZT0iU3RyaW5nIi8+PC9hdHRyaWJ1dGU+PGF0dHJpYnV0ZSBuYW1lPSJHb2xkZW5Tb3VyY2UiPjx2YWx1ZSB0eXBlPSJTdHJpbmciLz48L2F0dHJpYnV0ZT48YXR0cmlidXRlIG5hbWU9IkxpbmtIZWxwbGluZSI+PHZhbHVlIHR5cGU9IlN0cmluZyIvPjwvYXR0cmlidXRlPjxhdHRyaWJ1dGUgbmFtZT0iS2xhc3NpZml6aWVydW5nIj48dmFsdWUgdHlwZT0iQkRQIEtsYXNzaWZpemllcnVuZyIgdmFsdWU9IiIvPjwvYXR0cmlidXRlPjxhdHRyaWJ1dGUgbmFtZT0iU3luY2ggTWVzc2RhdGVuIHp1IEludGVncmF0aW9uIj48dmFsdWUgdHlwZT0iQm9vbGVhbiIgdmFsdWU9IiIvPjwvYXR0cmlidXRlPjwvZGltZW5zaW9ucz48bWVhc3VyZXM+PGF0dHJpYnV0ZSBuYW1lPSJhYmZyYWdlaWQiPjx2YWx1ZSB0eXBlPSJpbnQiIHZhbHVlPSIzMzY3NCIvPjwvYXR0cmlidXRlPjxhdHRyaWJ1dGUgbmFtZT0iemVpdHJlaWhlaWQiPjx2YWx1ZSB0eXBlPSJpbnQiIHZhbHVlPSI0NDgxNTIiLz48L2F0dHJpYnV0ZT48YXR0cmlidXRlIG5hbWU9ImRhdGVucXVlbGxlIj48dmFsdWUgdHlwZT0ic3RyaW5nIiB2YWx1ZT0iQ0FMQyIvPjwvYXR0cmlidXRlPjxhdHRyaWJ1dGUgbmFtZT0iZGF0ZW5hdXNnZXJvbGx0Ij48dmFsdWUgdHlwZT0ic3RyaW5nIiB2YWx1ZT0iT0hORSIvPjwvYXR0cmlidXRlPjxhdHRyaWJ1dGUgbmFtZT0iZGF0dW1aZWl0VVRDVm9uIj48dmFsdWUgdHlwZT0iZGF0ZVRpbWUiIHZhbHVlPSIwMDAxLTAxLTAxVDAwOjAwOjAwWiIvPjwvYXR0cmlidXRlPjxhdHRyaWJ1dGUgbmFtZT0iZGF0dW1aZWl0VVRDQmlzIj48dmFsdWUgdHlwZT0iZGF0ZVRpbWUiIHZhbHVlPSIwMDAxLTAxLTAxVDAwOjAwOjAwWiIvPjwvYXR0cmlidXRlPjxhdHRyaWJ1dGUgbmFtZT0iYWJncmVuenVuZyI+PHZhbHVlIHR5cGU9InN0cmluZyIgdmFsdWU9IlZPUk5FIi8+PC9hdHRyaWJ1dGU+PGF0dHJpYnV0ZSBuYW1lPSJ6ZWl0cmVpaGVFTlRTT0VDdXJ2ZVR5cGUiPjx2YWx1ZSB0eXBlPSJzdHJpbmciIHZhbHVlPSJOb3REZWZpbmVkIi8+PC9hdHRyaWJ1dGU+PGF0dHJpYnV0ZSBuYW1lPSJ6ZWl0cmVpaGVRdWFsaXR5Ij48dmFsdWUgdHlwZT0ic3RyaW5nIiB2YWx1ZT0iVU5DSEVDS0VEIi8+PC9hdHRyaWJ1dGU+PC9tZWFzdXJlcz48cGVyaW9kPjx0aW1lSW50ZXJ2YWw+PHN0YXJ0PjIwMjMtMDItMjJUMDA6MDBaPC9zdGFydD48ZW5kPjIwMjMtMDItMjJUMDE6MDBaPC9lbmQ+PC90aW1lSW50ZXJ2YWw+PHJlc29sdXRpb24+UFQxSDwvcmVzb2x1dGlvbj48cG9pbnQ+PERhdHVtWmVpdFVUQz4yMDIzLTAyLTIyVDAwOjAwOjAwWjwvRGF0dW1aZWl0VVRDPjxwb3NpdGlvbj4xPC9wb3NpdGlvbj48cXVhbnRpdHk+MDwvcXVhbnRpdHk+PC9wb2ludD48L3BlcmlvZD48L3RpbWVTZXJpZXM+PC90c0RvY3VtZW50Pg=="}} 
'
```

response should be:

```
{
    "receiveDocument": "silo:33674:448152:202302220000-1",
    "result": "ok"
}
```

##### Stop Docker Container:

```
docker stop `docker container ls | grep "tp-earchive-mock*" | awk '{ print $1 }'`
```

### Run with docker-compose

Build and start the container by running

```
docker-compose up -d 
```

##### Stop Docker Container:

```
docker-compose down
```

### Deploy under the Kuberenetes cluster

#### Prerequisite

##### MiniKube

Installed:
[MiniKube](https://www.digitalocean.com/community/tutorials/how-to-use-minikube-for-local-kubernetes-development-and-testing)

Start minikube with command:

```
minikube start
```

#### Retrieve and deploy application

```
kubectl create deployment spring-hello-world --image=dsec/hello-world-example_hello-world:latest
```

#### Expose deployment as a Kubernetes Service

```
kubectl expose deployment spring-hello-world --type=NodePort --port=8080
```

#### Check whether the service is running

```
kubectl get service tp-earchive-mock
```

response should something like:

```
NAME                TYPE       CLUSTER-IP      EXTERNAL-IP   PORT(S)          AGE
tp-earchive-mock   NodePort   xx.xx.xxx.xxx   <none>        8080:xxxxx/TCP   4m
```

#### Retrieve URL for application(hello-spring-boot)

```
minikube service spring-hello-world --url
```

response will be http..., e.g:

```
http://127.0.0.1:44963
```

#### Test application with ***curl*** command(note: port is randomly created)

```
curl 127.0.0.1:44963/...
```