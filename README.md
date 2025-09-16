# RentHouse
This project aims to build a complete rental housing system using popular modern technologies.

Project Introduction

The Rent-House project is a rental system modeled after “Ziroom,” built with SpringBoot + Elasticsearch and deployed via Docker containers. The system mainly includes modules such as rental homepage, property search, property display, map-based property search, nearby property search, favorites, house viewing appointments, user center, posting management, and account management.

Online Demo

(Due to personal budget constraints, the online site is no longer available. Please deploy locally using Docker as described below.)

Technology Stack
Backend Technologies
Technology	Description	Official Website
SpringBoot	Container + MVC framework	https://spring.io/projects/spring-boot

SpringSecurity	Authentication & Authorization framework	https://spring.io/projects/spring-security

SpringDataJpa	ORM framework	https://docs.spring.io/spring-data/jpa/docs/current/reference/html/

Elasticsearch	Search engine	https://www.elastic.co/cn/

Kibana	Elastic visualization tool	https://www.elastic.co/cn/kibana

Swagger-UI	API documentation tool	https://github.com/swagger-api/swagger-ui

Redis	Distributed cache	https://redis.io/

Docker	Container engine	https://www.docker.com/

Druid	Database connection pool	https://github.com/alibaba/druid

Lombok	Simplifies object encapsulation	https://github.com/rzwitserloot/lombok

MySQL	Relational database	https://www.mysql.com/

Kafka	Message queue	http://kafka.apache.org/

Zookeeper	Registry center	https://zookeeper.apache.org/
Frontend Technologies
Technology	Description	Official Website
React Hook	Frontend framework	https://react.docschina.org/docs/hooks-intro.html

React Router	Routing framework	https://reactrouter.com/

Redux	Global state management	https://redux.js.org/

TypeScript	JavaScript superset	https://www.typescriptlang.org/

Ant Design	UI framework	https://ant.design/index-cn

Nprogress	Progress bar plugin	https://www.npmjs.com/package/nprogress

Swiper	Carousel/slider plugin	https://swiperjs.com/

Axios	HTTP client	https://www.axios.com/

React-Sticky	Sticky component	https://www.npmjs.com/package/react-sticky

React-Custom-Scrollbar	Custom scrollbar	https://github.com/malte-wessel/react-custom-scrollbars
Quick Start
One-Click Deployment with Docker-Compose

Go to the docker directory of the project. Modify the configuration marked with #***** [Modify Here] ***** in application.yml and docker-compose.yml.

Make sure to set the KAFKA_ADVERTISED_HOST_NAME in docker-compose.yml to your host IP.

Run the following commands in the docker directory:

Run in terminal:

docker-compose up


Run in background:

docker-compose up -d


Stop containers:

docker-compose stop


Stop and remove containers:

docker-compose down


View logs:

docker-compose logs -f


After starting, access the frontend at: http://localhost:8888

Backend API documentation: http://localhost:8080/swagger-ui.html

Note: Pulling Docker images may take some time. If your network is slow, this method may not be ideal. If you are new to Docker, you may need to learn it first: Docker Official Website

Frontend Development / Learning

To start the frontend project:

Clone the frontend source code (Frontend Source
)

Run:

yarn install


Start the project:

yarn start


The frontend will open at localhost:3000. By default, it connects to the personal backend server. If you deployed a local development environment via Docker, you can modify the IP in config-override.js to connect locally.

Default API documentation: http://rent-house.touchfish.top

Secondary Development

For further development, you can set up your own environment:

Database schema: rent-house/src/main/resources/db/rent-house.sql

Elasticsearch index: rent-house/src/main/resources/db/house_index__ik_mapping_suggestion.json (requires IK Analyzer plugin)

Redis: configure in application-dev.yml

Kafka: configure in application-dev.yml

Zookeeper: Kafka registry center

Kibana: optional, for managing Elasticsearch

Project Interface Preview
