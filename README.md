# Spring for mock data

### To Use

It only takes GET requests:

- `/values` : Returns 100 values
- `/values/{id}` : Returns a value with the given id

You can request with curl like

    curl -v GET https://localhost:8080/values | json_pp




