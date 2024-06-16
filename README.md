# Proyecto-Relacion-DDBB
El proyecto es una aplicación de gestión de préstamos de libros en una biblioteca. 
La aplicación permite a los usuarios realizar operaciones (Crear, Leer, Actualizar y Eliminar)  con el  Usuario, Libro y Prestamo, para manejar la lógica de negocio y el acceso a datos, respectivamente.
En Usuario el  @OneToOne indica que la entidad Usuario es el propietario inverso de la relación. Esto significa que el mapeo físico de la relación se define en la entidad Direccion, usando el campo usuario.
En Usuario y Libro tienen una relación @OneToMany con Prestamo, indicando que un usuario o un libro pueden tener varios préstamos.
En Prestamo tiene relaciones @ManyToOne con Usuario y Libro, indicando que cada préstamo pertenece a un único usuario y a un único libro.
En Usuario tiene una relación @ManyToMany con Libro, indicando que un usuario puede tener varios libros y un libro puede ser compartido por varios usuarios.

