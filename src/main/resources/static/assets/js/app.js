window.addEventListener('WebComponentsReady', function () {
    customElements.whenDefined('vaadin-date-picker').then(
        _ => {
            const datePicker = document.querySelector("vaadin-date-picker");
            console.dir(datePicker);
            datePicker.addEventListener("value-changed", e => {
                var dateValue = e.detail.value
                console.log(dateValue)

                var xhttp = new XMLHttpRequest();
                xhttp.addEventListener("load", e => {
                    console.dir(e.target.status);
                });

                xhttp.open("POST", "/datelogs", true);

                xhttp.setRequestHeader("Content-type", "text/plain");
                xhttp.send(dateValue);
            });


        });

    var menuEl = document.querySelector('#demo-menu');
    var menu = new mdc.menu.MDCSimpleMenu(menuEl);
    var toggle = document.querySelector('.toggle');
    toggle.addEventListener('click', function() {
        menu.open = !menu.open;
    });
});
