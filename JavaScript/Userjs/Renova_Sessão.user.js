// ==UserScript==
// @name        Renova Sessão
// @namespace   SAGRES Portal
// @include     */WebApps/Academico/default.aspx
// @include     */Academico.WebApp/Default.aspx
// @include     http://localhost:64437/default.aspx
// @version     1
// @grant       none
// ==/UserScript==

//setInterval(function () {
//    $('.aLogout').click();
//  }, 15 * 60 * 1000);

setInterval(function () {
  var sessionTime = $(".session_text")[0].innerHTML.split('m')[0];
  if(sessionTime < 2)
    $('.aLogout').click();
}, 60 * 1001);
