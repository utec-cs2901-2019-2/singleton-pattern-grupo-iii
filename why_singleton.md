# Singleton Design Pattern: Question 3

**Question**

> Improve ChocolateBoiler class by turning it into a Singleton .. - Everyone knows that all modern chcolate factories have computer controlled chocolate boilers. The job of the boiler is to take the chocolate and milk, bring them to a boil, and then pass them on to the next phase of making chocolate bars. Probably suspect that if two ChocolateBoiler instances get loose, some very bad things can happen. How might things go wrong if more than one instance of ChocolateBoiler is created in an application.

**Answer**

Assuming that we're dealing with just one Chocolate Boiler in real life that is controlled by a single instance of the ChocolateBoiler class, the accidental creation of a second one would produce an instance that refers to an object that doesn't exist in real life. This would, in turn, allow for commands intented to the original Chocolate Boiler to be lost or the order of operations to be inconsistent. The resulting product would therefore be flawed.
