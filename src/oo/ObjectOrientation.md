# Object Orientation

## Objects
Model the real world in code like a Car, or a Person
with properties and capabilities

### Properties:
- Car.color
- Person.name

### Capabilities:
- Car.accelerate
- Person.drive

## Relationships
- Person owns a Car

## Major Components

### Objects
Specific things, like a Car, Person or House with properties
and behavior

### Classes
Generic blueprints from which specific Objects are created.

i.e. House could be used to create a Red House or Blue House

### Properties
Define some data associated with an Object.
Defined within the Class.
Allow us to create variations of Objects

#### Car
- Color
- Make
- Model

### Methods
Define the functionality our Object has.
Defined within the Class.

#### Car
- Accelerate
- Brake

### Interfaces
Define a contract that a Class can adhere to.

An Interface like *Driveable* might include a method called *drive()*

Any Class that implements the *Driveable* Interface must provide
an implementation of the *drive()* method