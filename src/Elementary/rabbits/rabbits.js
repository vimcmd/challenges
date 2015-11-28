function Rabbit(adjective) {
    Rabbit.count++;
    this.adjective = adjective;
    this.describeMyself = function () {
        return console.log("I am a " + this.adjective + " rabbit");
    };
}

Rabbit.count = 0;

// now we can easily make all of our rabbits
var rabbit1 = new Rabbit("fluffy");
var rabbit2 = new Rabbit("happy");
var rabbit3 = new Rabbit("sleepy");
var rabbit4 = new Rabbit("high");

for (i = 1; i <= Rabbit.count; i++) {
    rabbitN = "rabbit" + i;
    console.log(this[rabbitN].describeMyself());
}
;