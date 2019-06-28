/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
"use strict";
var myInit = { method: 'GET',
    headers: {
        'Content-Type'
    }
let myRequest = new Request("./family.json");

fetch(myRequest)
        .then(function(resp) {
            return resp.json();
        })
                .then(function(data) {
                    console.log(data);
        });


: