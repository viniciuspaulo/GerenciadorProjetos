/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function () {
    var posicaoPagina = $(window).scrollTop();
    var pcIdosos = 0.00;
    var pcIdososCalc = 0.00;

    $('#subir').click(function () {
        $('html, body').animate({scrollTop: 0}, 'slow');
        return false;
    });
    
    $("#oqueSomos").click(function (){
        $('html, body').animate({scrollTop: 470}, 'slow');
    });
    $("#projetosAtividades").click(function (){
        $('html, body').animate({scrollTop: 2540}, 'slow');
    });
    $("#sejaVoluntario").click(function (){
        $('html, body').animate({scrollTop: 3440}, 'slow');
    });
    $("#contatos").click(function (){
        $('html, body').animate({scrollTop: 5960}, 'slow');
    });
    

    if (posicaoPagina > 0) {
        $(".opacity0").css("opacity", 1);
        $(".b1, .b2, .b3, .b4, .b5, .b6, .b7, .b8").css("opacity", 1);
        $(".menu").css("background", "whitesmoke");
        $(".menu").css("-webkit-box-shadow", "0px 5px 4px -5px rgba(0,0,0,0.75)");
        $(".menu").css("-moz-box-shadow", "0px 5px 4px -5px rgba(0,0,0,0.75)");
        $(".menu").css("box-shadow", "0px 5px 4px -5px rgba(0,0,0,0.75)");
    }

    $(window).scroll(function () {
        var top = $(window).scrollTop();
        console.log(top);

        if (top < 10) {
            $(".menu").css("background", "none");
            $(".menu").css("background", "none");
            $(".menu").css("-webkit-box-shadow", "none");
            $(".menu").css("-moz-box-shadow", "none");
            $(".menu").css("box-shadow", "none");
        }
        if (top > 0) {
            $(".menu").css("background", "whitesmoke");
            $(".menu").css("-webkit-box-shadow", "0px 5px 4px -5px rgba(0,0,0,0.75)");
            $(".menu").css("-moz-box-shadow", "0px 5px 4px -5px rgba(0,0,0,0.75)");
            $(".menu").css("box-shadow", "0px 5px 4px -5px rgba(0,0,0,0.75)");
        }
        if ((top > 55) && (top < 210)) {
            $(".containerOqueSomos").addClass("animated fadeIn");
        }
        if ((top > 1000) && (top > 1010)) {
            $(".containerFundador").addClass("animated fadeIn");
        }
        if ((top > 1550) && (top > 1560)) {
            $(".containerInformacoes").addClass("animated fadeIn");
            calcularIndiceBrasil();
        }
        if ((top > 1970) && (top > 1980)) {
            $(".conatinerProjetos").addClass("animated fadeIn");
        }
        if ((top > 2500) && (top > 2590)) {
            $(".conatinerProjetos").addClass("animated fadeIn");

            $(".b1").addClass("animated bounceInDown");
            $(".b2").addClass("animated bounceInRight");
            $(".b3").addClass("animated bounceInRight");
            $(".b4").addClass("animated bounceInRight");
            $(".b5").addClass("animated bounceInUp");
            $(".b6").addClass("animated bounceInLeft");
            $(".b7").addClass("animated bounceInLeft");
            $(".b8").addClass("animated bounceInLeft");
            $(".b1, .b2, .b3, .b4, .b5, .b6, .b7, .b8").css("opacity", 1);
        }
        if ((top > 2760) && (top > 2770)) {
            $(".containerVoluntario").addClass("animated fadeIn");
        }
        if ((top > 4800) && (top > 4810)) {
            $(".containerArtigos").addClass("animated fadeIn");
        }
    });

    function calcularIndiceBrasil() {
        setInterval(function () {
            if (pcIdosos < 2.5) {
                $("#pcIdosos").html(pcIdosos.toFixed(1) + "%");
            }
            if (pcIdosos < 10.8) {
                $("#pcIdosos2").html(pcIdosos.toFixed(1) + "%");
            }
            if (pcIdososCalc < 400.1) {
                $("#pcIdosos3").html(pcIdososCalc.toFixed(1) + "%");
            }
            pcIdosos += 0.1;
            pcIdososCalc+=2;
        }, 10);
    }
});


function painelLogin(){
    $(".painelLogin").toggle();
    $(".painelLogin").addClass("animated fadeInRight");
}