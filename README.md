# MC1-CurrencyConverter
A small currency converter app that converts from USD to LBP and vice versa.
---
## Version 1.1 Update:

Major changes to the application:
***************************************
1. Complete makeover of the code logic that avoids error and has better handling of the application.

    - Input type is defined to avoid String to Double conversion errors.
    - One box defined replaced the two boxes for the value amount to avoid the logic error when the two value boxes are filled after the first conversion. As such, no two currency LBP and USD boxes and only an "amount text box" is placed.
    - Consequently, the result no longer can be in an EditText and is placed in a TextView to follow the one box strategy.
    - The use of flags and the conversion button to define the from/to conversion flow.
    - Removed the currency dialogue boxes (USD and LBP) as they are redundant and kept the universal dialogue in case errors arise.

 ***************************************
 2. Redesign of UI to suit the new code design.
   #### Activity_Main1

    - redefined color palette from "#039BE5" to "#40CEEF"
    - colored the word "app" inside the welcome text

   #### Activity_Main2
   
    - New button to make a clearer conversion direction for user.
    - Added animation inside the activity_main2.xml page to enhance page appearance.
    - Reshuffled position of buttons to suit the layout by placing it under the value.
   ***************************************

