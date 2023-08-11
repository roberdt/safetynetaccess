/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
*   Function Name:  setSafetyNetAccessMain()
*   Description :   Used to set up the timepicker. 
*   Parameters:     Used onLoad in the Body section.
*   Return:         Nothing
*/
function setSafetyNetAccessMain(){

 $(function() {
    $( "#sortable" ).sortable();
  });
  
}

/**
*   Function Name:  openNav()
*   Description :   Used open nav. 
*   Parameters:     None.
*   Return:         Nothing
*/
function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
}
/**
*   Function Name:  closeNav()
*   Description :   Used close nav. 
*   Parameters:     None.
*   Return:         Nothing
*/
function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
}
