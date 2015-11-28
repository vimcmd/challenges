var friends = {};
friends.bill = {
    firstName: "Bill",
    lastName: "Klinton",
    number: "(444)-23-79",
    address: ["New Gampshire", "CA", "98764"]
};
friends.steve = {
    firstName: "Steve",
    lastName: "Jobs",
    number: "(555)-23-79",
    address: ["Redmond Ave", "WA", "46789"],
    // non-default value
    email: "steve@jobs.fu"
};

var list = function (param) {
    for (var prop in param) {
        console.log(prop)
    }
    ;
};

var search = function (keyword) {
    for (var key in friends) {
        if (friends[key].firstName === keyword) {
            // console.log(friends[key]);
            // return friends[key];
            for (attr in friends[key]) {
                // give names for friends[key] attributes
                switch (attr) {
                    case 'firstName':
                        var value = "First Name";
                        break;
                    case 'lastName':
                        var value = "Last Name";
                        break;
                    case 'number':
                        var value = "Number";
                        break;
                    case 'address':
                        var value = "Address";
                        break;
                    default:
                        var value = attr + " (unknown label)";
                }
                console.log([value] + ": " + friends[key][attr])

            }
        }
    }
};
//list(friends);
search("Steve")