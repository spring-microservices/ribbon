# Ribbon Demo


Start multiple instances of `SayHelloApplication` at different ports. ie. 7777,8888,9999

Start `UserApplication` at port `8080`

`curl http://localhost:8080/hi?name=Manu`.  
Each time the response will come from different services.