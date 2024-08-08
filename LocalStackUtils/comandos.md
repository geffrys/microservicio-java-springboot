# Secret Manager
```bash

aws --endpoint-url=http://localhost:4566 secretsmanager create-secret --name db-info --description "Descripción del secreto" --secret-string '{"url":"jdbc:mysql://localhost:3306/", "username":"root", "password":"root"}'

aws --endpoint-url=http://localhost:4566 secretsmanager get-secret-value --secret-id db-info

aws --endpoint-url=http://localhost:4566 secretsmanager delete-secret --secret-id db-info --force-delete-without-recovery

```