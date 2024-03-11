
var phoneBackStatus = {
    onBackPressed: function (args,success, error) {
        cordova.exec(success, error, 'PhoneBackStatus', 'onBackPressed', [args])
    },

    botBarHeight: function (args, success, error) {
        cordova.exec(success, error, "PhoneBackStatus", "botBarHeight", [args])
    },

    testPhoneStatus: function (args, success, error) {
        cordova.exec(success, error, "PhoneBackStatus", "testPhoneStatus", [args])
    }
}

module.exports = phoneBackStatus;
