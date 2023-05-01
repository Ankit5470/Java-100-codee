/* create a enum day with a enumiration constant as day per week check with one constructor which will
take object as an argument declare a data member d of type enum then there is a function void print
which uses the switch case to print the day selected otherwise it will print not a day of the week .
create a main method class to take string input from the user as the day of the week and store it in 
string variable pass this string as an argument to the constructor and caal the prin  t function to print
the appropriate day entered by the user */

enum dayofweek
{
      MONDAY,
      TUESDAY,
      WEDNESDAY,
      THURSDAY,
      FRIDAY,
      SATURDAY,
      SUNDAY;
}
class check
{
    day d;
    check(day ob)
    {
         d=ob;
    }
    void print()
    {
              switch(d)
              {
                  case SUNDAY:
                        System.out.println("Sunday is the 1st day of the week")
                        break;
                  case MONDYA:=
      }
    }   
}
