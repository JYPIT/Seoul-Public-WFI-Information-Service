function getLocation() {
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(showPosition)
    }
}

function showPosition(position) {
    document.getElementById('lat').value = position.coords.latitude
    document.getElementById('lnt').value = position.coords.longitude

    console.log("Get Coordinate:)")
}

window.addEventListener('load', function (event) {
    document.getElementById('getPositionBtn').addEventListener('click', function (event) {
        getLocation()
    });

});

