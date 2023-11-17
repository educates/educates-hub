function toggleDropdown() {
    $('#dropdown').toggleClass("open");
}

function showBadgeIfMoreThan2Labels(){
    // Get labels as subelements of tile-label-area
    $('.tile-label-area').each(function (idx, element) {
        console.log("element", element);
        var i = 0;
        $(element).find(".tile-label").each(function (labelIdx, label){
            i++;
            // If more than 2, remove and then add a badge with number
            if (i>2){
                $(label).hide();
            }
        });
        if (i>2){
            $(element).append('<span class="badge badge-info">'+i+'</span>');
        }
    });
}

$(document).ready(function () {
    $('#dropdown-button').click(function () {
        toggleDropdown();
    });
    showBadgeIfMoreThan2Labels();
});