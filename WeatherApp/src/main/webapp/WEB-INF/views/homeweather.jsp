<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--
  Created by IntelliJ IDEA.
  User: isirbu
  Date: 12/2/2016
  Time: 10:21 AM
  To change this template use File | Settings | File Templates.
--%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
    <title>Harta Romaniei html/css - PixelAlb</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="romania, harta fizica, harta, webdesign, html,css, gratuit, free" />
    <meta name="description" content="Harta Romaniei versiunea html/css oferita cu mandrie de PixelAlb." />
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.js" type="text/javascript"></script>
</head>

<body>

<style>
    body{
        background-image: url("http://il6.picdn.net/shutterstock/videos/6131948/thumb/1.jpg");
        background-size: cover;
    }
    table, th, td {
        border: 1px solid black;
        border-collapse: collapse;
    }
    th, td {
        padding: 15px;
    }
    ul.mapRomania { list-style-type:none; font-family: Tahoma, Sans-serif; font-size:12px; line-height:12px;width:580px; height:409px; float: left; position: relative; margin-top: 5%; margin-left: 10%; }
    .mapRomania a{display: block; position: absolute; font-size:11px; color: #f49c65; text-align: center; text-decoration: none;  }
    .ocupat a {color: black !important; }
    .mapRomania a:hover {  color: red; }
    .mapRomania .satuMare{width:86px; height: 47px; top:16px; padding: 20px 0 0 0; left:121px; background: url(/judete/satu_mare.gif) no-repeat 0 0;  z-index:2}
    .mapRomania .maramures{width:120px; height: 40px; top:26px;  padding: 16px 0 0 0; left:167px; background: url(/judete/maramures.gif) no-repeat 0 0;}
    .mapRomania .suceava{width:105px; height: 55px;  padding: 20px 0 0 0; top:27px; left:281px; background: url(/judete/suceava.gif) no-repeat 0 0;}
    .mapRomania .botosani{width:70px; height: 46px;  padding: 20px 0 0 0; top:2px; left:351px; background: url(/judete/botosani.gif) no-repeat 0 0;}
    .mapRomania .bihor{width:80px; height: 65px;  padding: 40px 0 0 0; top:59px; left:76px; background: url(/judete/bihor.gif) no-repeat 0 0;}
    .mapRomania .salaj{width:80px; height: 41px;  padding: 10px 0 0 0;top:70px; left:138px; background: url(/judete/salaj.gif) no-repeat 0 0; z-index:2}
    .mapRomania .cluj{width:94px; height: 44px;  padding: 40px 0 0 0; top:78px; left:146px; background: url(/judete/cluj.gif) no-repeat 0 0;}
    .mapRomania .bistritaNasaud{width:67px; height: 54px;  padding: 20px 0 0 0; top:57px; left:223px; background: url(/judete/bistrita_nasaud.gif) no-repeat 0 0;}
    .mapRomania .mures{width:80px; height: 55px; padding: 40px 0 0 0; top:96px; left:225px; background: url(/judete/mures.gif) no-repeat 0 0;}
    .mapRomania .harghita{width:84px; height: 52px;  padding: 40px 0 0 0; top:93px; left:280px; background: url(/judete/harghita.gif) no-repeat 0 0;}
    .mapRomania .neamt{width:83px; height: 42px;  padding: 20px 10px 0 0; top:78px; left:326px; background: url(/judete/neamt.gif) no-repeat 0 0;}
    .mapRomania .iasi{width:95px; height: 46px;  padding: 20px 0 0 0; top:55px; left:375px; background: url(/judete/iasi.gif) no-repeat 0 0;}
    .mapRomania .arad{width:120px; height: 47px;  padding: 20px 0 0 0; top:136px; left:31px; background: url(/judete/arad.gif) no-repeat 0 0;}
    .mapRomania .alba{width:93px; height: 77px;  padding: 20px 0 0 0; top:145px; left:147px; background: url(/judete/alba.gif) no-repeat 0 0;  z-index:2}
    .mapRomania .sibiu{width:80px; height: 51px;   padding: 20px 0 0 0;top:172px; left:204px; background: url(/judete/sibiu.gif) no-repeat 0 0;}
    .mapRomania .hunedoara{width:77px; height: 71px;  padding: 30px 0 0 0; top:164px; left:127px; background: url(/judete/hunedoara.gif) no-repeat 0 0;}
    .mapRomania .brasov{width:79px; height: 49px;  padding: 20px 10px 0 0; top:179px; left:266px; background: url(/judete/brasov.gif) no-repeat 0 0;}
    .mapRomania .covasna{width:63px; height: 43px; padding: 20px 0 0 0; top:169px; left:313px; background: url(/judete/covasna.gif) no-repeat 0 0;}
    .mapRomania .bacau{width:82px; height: 51px;  padding: 20px 0 0 0; top:122px; left:346px; background: url(/judete/bacau.gif) no-repeat 0 0;}
    .mapRomania .vaslui{width:65px; height: 66px;  padding: 20px 0 0 0; top:106px; left:416px; background: url(/judete/vaslui.gif) no-repeat 0 0;}
    .mapRomania .galati{width:63px; height: 49px;  padding: 20px 0 0 0; top:176px; left:423px; background: url(/judete/galati.gif) no-repeat 0 0;}
    .mapRomania .vrancea{width:75px; height: 49px;  padding: 20px 0 0 0; top:176px; left:372px; background: url(/judete/vrancea.gif) no-repeat 0 0;}
    .mapRomania .timis{width:136px; height: 66px;  padding: 20px 0 0 0;top:180px; left:3px; background: url(/judete/timis.gif) no-repeat 0 0;}
    .mapRomania .carasSeverin{width:81px; height: 53px;  padding: 40px 0 0 0; top:225px; left:67px; background: url(/judete/caras_severin.gif) no-repeat 0 0;}
    .mapRomania .gorj{width:80px; height: 50px;  padding: 20px 0 0 0; top:251px; left:139px; background: url(/judete/gorj.gif) no-repeat 0 0; z-index:2}
    .mapRomania .valcea{width:80px; height: 50px;  padding: 20px 0 0 0; top:232px; left:202px; background: url(/judete/valcea.gif) no-repeat 0 0;}
    .mapRomania .arges{width:54px; height: 88px;  padding: 20px 0 0 0; top:229px; left:255px; background: url(/judete/arges.gif) no-repeat 0 0;}
    .mapRomania .dambovita{width:54px; height: 32px;  padding: 60px 0 0 0; top:241px; left:297px; background: url(/judete/dambovita.gif) no-repeat 0 0;}
    .mapRomania .prahova{width:64px; height: 45px;  padding: 25px 10px 0 0; top:235px; left:316px; background: url(/judete/prahova.gif) no-repeat 0 0;}
    .mapRomania .buzau{width:74px; height: 50px;  padding: 20px 0 0 0; top:211px; left:354px; background: url(/judete/buzau.gif) no-repeat 0 0;}
    .mapRomania .braila{width:71px; height: 50px;  padding: 20px 0 0 0; top:233px; left:416px; background: url(/judete/braila.gif) no-repeat 0 0;}
    .mapRomania .mehedinti{width:92px; height: 40px;  padding: 50px 0 0 0; top:272px; left:105px; background: url(/judete/mehedinti.gif) no-repeat 0 0;}
    .mapRomania .dolj{width:85px; height: 70px;  padding: 20px 0 0 0; top:307px; left:160px; background: url(/judete/dolj.gif) no-repeat 0 0;}
    .mapRomania .olt{width:62px; height: 68px;  padding: 40px 0 0 0; top:291px; left:221px; background: url(/judete/olt.gif) no-repeat 0 0;}
    .mapRomania .teleorman{width:70px; height: 58px;  padding: 20px 0 0 0; top:325px; left:266px; background: url(/judete/teleorman.gif) no-repeat 0 0;}
    .mapRomania .giurgiu{width:66px; height: 57px;  padding: 20px 0 0 0; top:320px; left:318px; background: url(/judete/giurgiu.gif) no-repeat 0 0;}
    .mapRomania .ilfov{width:28px; height: 32px; padding: 10px 0 0 0; top:301px; left:347px; background: url(/judete/ilfov.gif) no-repeat 0 0;}
    .mapRomania .ialomita{width:118px; height: 30px; padding: 15px 0 0 0; top:292px; left:368px; background: url(/judete/ialomita.gif) no-repeat 0 0;}
    .mapRomania .calarasi{width:115px; height: 22px; padding: 20px 0 0 0; top:321px; left:366px; background: url(/judete/calarasi.gif) no-repeat 0 0;}
    .mapRomania .constanta{width:101px; height: 38px; padding: 57px 0 0 0; top:291px; left:432px; background: url(/judete/constanta.gif) no-repeat 0 0;}
    .mapRomania .tulcea{width:102px; height: 47px; padding: 25px 0 0 0; top:235px; left:475px; background: url(/judete/tulcea.gif) no-repeat 0 0;}
</style>

<h2 style="text-align: center;">Weather in Romania today</h2>

<ul id="map_block" class="mapRomania">

    <li><a class="satuMare" href="/city/weather?city=SatuMare">Satu Mare<span class="snow">&nbsp;</span></a></li>
    <li><a class="maramures" href="/city/weather?city=Maramures">Maramures<span class="effect">&nbsp;</span></a></li>
    <li><a class="suceava" href="/city/weather?city=Suceava">Suceava<span class="effect">&nbsp;</span></a></li>
    <li><a class="botosani" href="/city/weather?city=Botosani">Botosani<span class="effect">&nbsp;</span></a></li>
    <li><a class="bihor" href="/city/weather?city=Bihor">Bihor<span class="snow">&nbsp;</span></a></li>
    <li><a class="salaj" href="/city/weather?city=Zalau">Salaj<span class="effect">&nbsp;</span></a></li>
    <li><a class="cluj" href="/city/weather?city=Cluj">Cluj<span class="effect">&nbsp;</span></a></li>
    <li><a class="bistritaNasaud" href="/city/weather?city=Bistrita Nasaud">Bistrita Nasaud<span class="effect">&nbsp;</span></a></li>
    <li><a class="mures" href="/city/weather?city=Mures">Mures<span class="effect">&nbsp;</span></a></li>
    <li><a class="harghita" href="/city/weather?city=Harghita">Harghita<span class="effect">&nbsp;</span></a></li>
    <li><a class="neamt" href="/city/weather?city=Neamt">Neamt<span class="effect">&nbsp;</span></a></li>
    <li><a class="iasi" href="/city/weather?city=Iasi">Iasi<span class="effect">&nbsp;</span></a> </li>
    <li><a class="arad" href="/city/weather?city=Arad">Arad<span class="acBlue">&nbsp;</span></a> </li>
    <li><a class="alba" href="/city/weather?city=Alba">Alba<span class="effect">&nbsp;</span></a> </li>
    <li><a class="sibiu" href="/city/weather?city=Sibiu">Sibiu<span class="acOrange">&nbsp;</span></a> </li>
    <li><a class="hunedoara" href="/city/weather?city=Hunedoara">Hunedoara<span class="effect">&nbsp;</span></a> </li>
    <li><a class="brasov" href="/city/weather?city=Brasov">Brasov<span class="effect">&nbsp;</span></a> </li>
    <li><a class="covasna" href="/city/weather?city=Covasna">Covasna<span class="effect">&nbsp;</span></a> </li>
    <li><a class="bacau" href="/city/weather?city=Bacau">Bacau<span class="effect">&nbsp;</span></a> </li>
    <li><a class="vaslui" href="/city/weather?city=Vaslui">Vaslui<span class="effect">&nbsp;</span></a> </li>
    <li><a class="galati" href="/city/weather?city=Galati">Galati<span class="effect">&nbsp;</span></a> </li>
    <li><a class="vrancea" href="/city/weather?city=Vrancea">Vrancea<span class="effect">&nbsp;</span></a> </li>
    <li><a class="timis" href="/city/weather?city=Timis">Timis<span class="effect">&nbsp;</span></a> </li>
    <li><a class="carasSeverin" href="/city/weather?city=CarasSeverin">Caras Severin<span class="effect">&nbsp;</span></a> </li>
    <li><a class="gorj" href="/city/weather?city=Gorj">Gorj<span class="effect">&nbsp;</span></a> </li>
    <li><a class="valcea" href="/city/weather?city=Valcea">Valcea<span class="effect">&nbsp;</span></a> </li>
    <li><a class="arges" href="/city/weather?city=Arges">Arges<span class="effect">&nbsp;</span></a> </li>
    <li><a class="dambovita" href="/city/weather?city=Dambovita">Dambovita<span class="effect">&nbsp;</span></a> </li>
    <li><a class="prahova" href="/city/weather?city=Prahova">Prahova<span class="effect">&nbsp;</span></a> </li>
    <li><a class="buzau" href="/city/weather?city=Buzau">Buzau<span class="effect">&nbsp;</span></a> </li>
    <li><a class="braila" href="/city/weather?city=Braila">Braila<span class="effect">&nbsp;</span></a> </li>
    <li><a class="mehedinti" href="/city/weather?city=Mehedinti">Mehedinti<span class="effect">&nbsp;</span></a> </li>
    <li><a class="dolj" href="/city/weather?city=Dolj">Dolj<span class="acOrange">&nbsp;</span></a> </li>
    <li><a class="olt" href="/city/weather?city=Olt">Olt<span class="effect">&nbsp;</span></a> </li>
    <li><a class="teleorman" href="/city/weather?city=Teleorman">Teleorman<span class="effect">&nbsp;</span></a> </li>
    <li><a class="giurgiu" href="/city/weather?city=Giurgiu">Giurgiu<span class="effect">&nbsp;</span></a> </li>
    <li><a class="ilfov" href="/city/weather?city=Ilfov">Ilfov<span class="effect">&nbsp;</span></a> </li>
    <li><a class="ialomita" href="/city/weather?city=Slobozia">Ialomita<span class="effect">&nbsp;</span></a> </li>
    <li><a class="calarasi" href="/city/weather?city=Calarasi">Calarasi<span class="effect">&nbsp;</span></a> </li>
    <li><a class="constanta" href="/city/weather?city=Constanta">Constanta<span class="effect">&nbsp;</span></a> </li>
    <li><a class="tulcea" href="/city/weather?city=Tulcea">Tulcea<span class="effect">&nbsp;</span></a> </li>
</ul>

<div style="margin-top:10%; margin-left:60%">
    <table>
        <tbody>
            <tr>
                <td>
                    City
                </td>
                <td>
                    <c:out value="${cit.name}"/>
                </td>
            </tr>
            <tr>
                <td>
                    Temperature
                </td>
                <td>
                    <c:out value="${cit.temp}°C"/>
                </td>
            </tr>
            <tr>
                <td>
                    Maximum temperature
                </td>
                <td>
                    <c:out value="${cit.temp_max}°C"/>
                </td>
            </tr>
            <tr>
                <td>
                    Minimum temperature
                </td>
                <td>
                    <c:out value="${cit.temp_min}°C"/>
                </td>
            </tr>
            <tr>
                <td>
                    Atmospheric pressure
                </td>
                <td>
                    <c:out value="${cit.pressure} hPa"/>
                </td>
            </tr>
            <tr>
                <td>
                    Humidity
                </td>
                <td>
                    <c:out value="${cit.humidity}%"/>
                </td>
            </tr>
        </tbody>
    </table>
</div>

</body>
</html>
