## Singleton Design Pattern

- Only one instance 

Steps
1. Make constructor private
2. Make a private static variable to hold instance
3. Check if instance is null assign a new instance else return same instance
4. Make code Thread Safe (using synchronized or Double locking).

