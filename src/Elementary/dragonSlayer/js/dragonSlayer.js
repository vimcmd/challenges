var slaying = true;
var youDodge = true;
// dragonHealth gives num between
var dragonHealth = Math.floor(Math.random() * 15) + 1;
// damagethisRound gives num between 1 and 5 (incl. 5)
var damageThisRound = Math.floor(Math.random() * 5 + 1);
var totalDamage = 0;

if (slaying && youDodge) {
    console.log("TotalHealth: " + dragonHealth + "\n")

    do {
        var damageThisRound = Math.floor(Math.random() * 5 + 1);
        var youDodge = Math.floor(Math.random() * 2);

        if (youDodge != 0) {
            totalDamage += damageThisRound
            dragonHealth -= damageThisRound;
            console.log("dodge: " + youDodge + "\n" + "hit: " + damageThisRound + "\n" + "health: " + dragonHealth + "\n" + "totalDamage: " + totalDamage + "\n")
        } else {
            console.log("dodge: " + youDodge + "\n" + "DEFEAT");
            break
        }
    }
    while (dragonHealth > 0)
    {
        slaying = false;
    }

}