# LeaseHub
This project aims to build a complete rental housing system using popular modern technologies.

# Project Introduction

The Rent-House project is a rental system modeled after “Ziroom,” built with SpringBoot + Elasticsearch and deployed via Docker containers. The system mainly includes modules such as rental homepage, property search, property display, map-based property search, nearby property search, favorites, house viewing appointments, user center, posting management, and account management.

# Online Demo

(Due to personal budget constraints, the online site is no longer available. Please deploy locally using Docker as described below.)

# Technology Stack
# # # # # Backend Technologies
| Technology     | Description	Official Website                                                        |
| -------------- | ------------------------------------------------------------ |
| SpringBoot     | https://spring.io/projects/spring-boot                       |
| SpringSecurity | [ https://spring.io/projects/spring-security](https://spring.io/projects/spring-security) |
| SpringDataJpa  | https://docs.spring.io/spring-data/jpa/docs/current/reference/html/ |
| Elasticsearch  | https://www.elastic.co/cn/                                   |
| Kibana         | https://www.elastic.co/cn/kibana                             |
| Swagger-UI     | https://github.com/swagger-api/swagger-ui                    |
| Redis          | https://redis.io/                                            |
| Docker         | [https://www.docker.com](https://www.docker.com/)            |
| Druid          | [ https://github.com/alibaba/druid](https://github.com/alibaba/druid) |
| Lombok         | [ https://github.com/rzwitserloot/lombok](https://github.com/rzwitserloot/lombok) |
| Mysql          | https://www.mysql.com/                                       |
| Kafka          | http://kafka.apache.org/                                     |
| Zookeeper      | https://zookeeper.apache.org/                                |


# # # # # Technology	Description	Official Website
| Technology             | Description	Official Website                                                                 |
| ---------------------- | ------------------------------------------------------- |
| React Hook             | https://react.docschina.org/docs/hooks-intro.html       |
| React Router           | https://reactrouter.com/                                |
| Redux                  | https://redux.js.org/                                   |
| TypeScript             | https://www.typescriptlang.org/                         |
| Ant Design             | https://ant.design/index-cn                             |
| Nprogress              | https://www.npmjs.com/package/nprogress                 |
| Swiper                 | https://swiperjs.com/                                   |
| Axios                  | https://www.axios.com/                                  |
| React-Sticky           | https://www.npmjs.com/package/react-sticky              |
| React-Custom-Scrollbar | https://github.com/malte-wessel/react-custom-scrollbars |


# # # # #  Quick Start
One-Click Deployment with Docker-Compose

Go to the docker directory of the project. Modify the configuration marked with #***** [Modify Here] ***** in application.yml and docker-compose.yml.

Make sure to set the KAFKA_ADVERTISED_HOST_NAME in docker-compose.yml to your host IP.

Run the following commands in the docker directory:

Run in terminal:  `docker-compose up`


Run in background:  `docker-compose up -d`


Stop containers: `docker-compose down`


Stop and remove containers:  `docker-compose logs -f`


# # # # Secondary Development

For further development, you can set up your own environment:

Database schema: rent-house/src/main/resources/db/rent-house.sql

Elasticsearch index: rent-house/src/main/resources/db/house_index__ik_mapping_suggestion.json (requires IK Analyzer plugin)

Redis: configure in application-dev.yml

Kafka: configure in application-dev.yml

Zookeeper: Kafka registry center

