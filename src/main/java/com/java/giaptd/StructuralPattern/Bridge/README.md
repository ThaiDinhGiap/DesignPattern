# Bridge Pattern Practice

## Project Structure

1. **Client**: The class that uses features by Abstraction - GamerClient 
2. **Abstraction**: Defines an abstract interface that manages the reference to a specific implementation object - Weapon
3. **Refined Abstraction (AbstractionImpl)**: Implements the methods defined in the Abstraction by using a reference to an object of the Implementor - Sword, Dagger
4. **Implementer**: Defines the interface for implementation classes - AttackType
5. **ConcreteImplementor**: Implements the Implementor interface - PhysicalAttack, MagicAttack, PoisonAttack






