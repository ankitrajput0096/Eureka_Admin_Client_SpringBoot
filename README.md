# Eureka Admin - Client Spring boot application 

Dockerized Spring Boot application with Eureka Admin Cluster and client services.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development purposes. See running for notes on how to run the project on a system.

### Prerequisites

1. Clone the project to your local environment:
    ```
    git clone https://github.com/ankitrajput0096/Eureka_Admin_Client_SpringBoot
    ```

2. You need Docker to be installed:

    #### Windows:
    https://download.docker.com/win/stable/Docker%20for%20Windows%20Installer.exe
    
    #### Mac:
    https://download.docker.com/mac/stable/Docker.dmg
    
    #### Ubuntu:
    https://docs.docker.com/install/linux/docker-ce/ubuntu/

### Installing

Once you have docker installed on your environment, install the project dependencies via:

Build docker Image:

```
docker-compose build
```

Start docker:

```
docker-compose up
```
Or


Start docker with scaled up services:

```
sudo docker-compose up --scale eurekaclientone=2 --scale eurekaclienttwo=3

```

## Running

Start docker:

```
docker-compose up
```
Or


Start docker with scaled up services:

```
sudo docker-compose up --scale eurekaclientone=2 --scale eurekaclienttwo=3

```
### NOTE:
Can scale up clientone and clienttwo services to max instances of 5.
If you want to scale even higher, then increase the port range in `docker-compose` file.

Your Eureka Admin server cluster should be now running on http://localhost:9001, http://localhost:9002, http://localhost:9003

## Eureka Server Cluster design: 
1. Creating three peer aware eureka servers cluster
![](images/eureka_cluster.png)
2. Way it handles failover of one eureka node in cluster
![](images/eureka_cluster_failover.png)


## Built With

* [Spring Boot](https://spring.io/projects/spring-boot) - Spring Boot 2
* [Maven](https://maven.apache.org/) - Dependency Management
* [Docker](https://www.docker.com/) - For containerization of application
* [Eureka](https://spring.io/guides/gs/service-registration-and-discovery/) - For Eureka admin and client

## Contributing

If you have any improvement suggestions please create a pull request and I'll review it.


## Authors

* **Ankit Rajput** - *Initial work* - [Github](https://github.com/ankitrajput0096)

## License

This project is licensed under the MIT License

## Acknowledgments

* Big thanks to Pivotal for Spring Boot framework, love it!


