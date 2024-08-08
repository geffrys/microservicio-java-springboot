FROM mysql:latest
ENV MYSQL_ROOT_PASSWORD=root    
ENV MYSQL_DATABASE=users
ENV MYSQL_USER=user
ENV MYSQL_PASSWORD=user
COPY todo.sql /docker-entrypoint-initdb.d/init.sql
VOLUME /var/lib/mysql
EXPOSE 3311:3306
