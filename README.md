# Long Parameter List Refactoring Practice

Long parameter lists make functions hard to work with. Luckily there are a number of refactorings we can apply to improve things.

1. Replace parameter with query - where one or more of the parameters come from an object that is also passed in when can remove the parameter and make the call to the method
2. Preserve whole object - Similar to above rather than passing in a few properties of an object as parameters pass in the whole object.
3. Remove flag argument, if one of the parameters tells the function how to behave introduce new methods for each of the cases
4. Introduce Parameter object, where you see the same clump of data passed into various functions you may benefit from bringing them together in their own object.

## Exercise

Engineers at mybooksonline have identified four pieces of code where the function parameters are starting to get out of hand, take a look at each and make one of the refactorings above. You can assume that the test code is reflective of the client code that calls these fumnctions, the arrange and act parts of the test code can be updated but leave the assertions alone. Once you have completed the refactorings go back and see if you can make them using more shortcuts.