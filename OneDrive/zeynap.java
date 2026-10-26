<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>java script></title>

</head>
<body>
    <script>
        let name="umulkheir"
        let age=19
        let university=('university')
        console.log("name")
        console.log("age")
        console.log("jamhuuriya")
        console.log("name:"+name)
        console.log("age:"+age)
        console.log("university:",university)
        //q2
        let x=2
        let y=10
        console.log(x>y)
        console.log(x<y)
        console.log(x<=y)
        console.log(x==y)



        //q3 typeof
        let num="42"
        let name2="java script"
        let check=true
        let num3=[1,2,3,4]
        console.log(typeof num);
        console.log(typeof name2);
        console.log(typeof check);
        console.log(typeof num3);

    //joint together
    let name4='hamdi'
    let age2=20
    let city="mogdisho"
    let info=' your are name ' + name4 + " you are  " +age+ "years old" + " you are live in " +city
    console.log(info)
    let dislay=`you are name is${name4} you are age${age}years old`
    console.log(dislay)
    console.log(typeof dislay)
    //loop
    console.log(1)
    console.log(2)
    console.log(4)
    console.log(5)
    console.log(6)
    console.log(7)
    console.log(8)
    console.log(9)
    console.log(10)
    //cosole.log("using loop")
    //how to use for loop
    //for(start;endp;update:inc/dec){loop}
    for(let count=1;count<10;count++){
        console.log(count)
        console.log("-------------")
    }
    //example 2
    for(let s=10;s<=60;s+=10){
        console.log(s)
    }
    //reverse
    for(let i=10;i>0;i--){
        console.log(i)
        console.log("------")
    }

    for(let n=50;n>=10;n--){
        console.log(n)
    }
    // how to use while loop
    let start=1
    while(start<10){
        console.log(start)
        // update
        start++
        console.log('-------')
    }
    // how to use continue
    for(let i=1;i<10;i++){
        console.log(i)
        if(i==4)continue
        console.log(i)
    }
    // how to use break
    for(let s=1;s<10;s++){
        if(s==5)break
        console.log(s)
        console.log('----')
    }
    for(let c=5;c<20;c++){
        if(c==4)break
        console.log
        console.log("----")
    }
    //santiel loop
    let checkUser=prompt ("do need calculation y or yes or n for no")
    while(checkUser !="n"){
        let num1 = Number(prompt("enter the num1"))
        let num2 = Number(prompt("enter the num2"))
        let sum= num1 + num2;
        alert(`the addision of${num1}and${num2}=${sum}`)
        checkUser=prompt("do need tocontinue calculation y or yes or n for nos")
    }
    // function
    let guess=Number(prompt("guess the number:"));
    while(guess !== 10){
        if (guess > 10){
            guess= Number(prompt("too high! try again:"));
        } else{
            guess=Number(prompt("too low! try again:"));
        }
    }
    alert("correct! you guessed the number:");

    let guess2=Number(prompt("guess number:"))
    let attempts=1
    while(guess2 !==10){
        if(guess2>=10){
            console.log("too high try again")
        } else{
            console.log("too low")
        }
        guess2=Number(prompt("Guess again:"))
        attempts++;
    }
    console.log("correct number")
    console.log("attempted" + attempts + "times")
       //console.log(Attempted ${attempted} times)    



    


    



        
        
        
        

        


















        







    </script>
    
</body>
</html>