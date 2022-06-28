function increase(){
    var count =0;
     return ()=>{
        count++;
        console.log(count);
     }
    }
    var inc = increase();
    inc();
    inc();
    inc();
    var add = increase();
    add();

    //Js is a Garbage Collector language;
    //Closure is a kind of temporary memory space;