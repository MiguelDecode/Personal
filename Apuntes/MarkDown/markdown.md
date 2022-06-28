# Encabezados

Los titulos o encabezados se van aplicando usando # para marcar el inicio de un título y la cantidad indica el nivel del encabezado.

# Título 1

## Título 2

### Título 3

#### Título 4

##### Título 5

###### Título 6

# Modificadores

- Esto es un texto en _cursiva_
- Esto es un texto en **negrita**
- Esto es un texto ~~tachado~~
- Esto es un texto en **_cursiva y negrita_**
- Esto es un texto en **_cursiva y negrita_**
- Esto es un texto en **_cursiva y negrita_**

# Listas

## Listas desordenadas

Se puede utilizar el asterisco, el símbolo + o el guión.

- Manzana
- Pera
- Naranja
- Kiwi

* Futból
* Baloncesto
* Rugby
* Baseball

- Lunes
- Martes
- Miércoles
- Jueves
- Viernes

## Listas ordenadas

1. Primero
2. Segundo
3. Tercero
4. Cuarto
5. Quinto
6. Sexto

## Sublistas

- España
  - Madrid
  - Barcelona
  - Galicia
    1. A Coruña
    2. Lugo
    3. Pontevedra
    4. Ourense
- Portugal
- Italia

## Listas de Tareas

- [x] Tarea 1
- [x] Tarea 2
- [ ] Tarea 3
- [ ] Tarea 4

# Enlaces

La estructura básica de un enlace consta de unos corchetes seguidos de unos paréntesis. Primero colocaremos los corchetes donde se indicará el nombre a mostrar y después los paréntesis donde irá el enlace. En esta ultima parte se puede añadir entre comillas el texto alternativo que deseemos mostrar en la caja de ayuda.

[Google](www.google.es "Texto alternativo")

Enlace a una parte interna del documento.

[Enlace interno al comienzo](#encabezados)

# Citas

> Esto es una cita donde podemos mostrar citas de personas importantes.

> > > Añadiendo mas > se pueden crear mayores indentaciones.

> Comienzo de la cita
>
> Resto de la cita
>
> Se le conoce como cita de bloque

# Separadores

Se pueden utilizar 3 guiones, tres asteriscos o tres guiones bajos para crear una linea que separa el contenido

---

---

---

# Código

Se puede colocar código en una sola linea utilizando el acento inverso al inicio y al final o en varias lineas colocando tres acentos inversos al inicio y tres al final. De esta ultima forma podemos especificar el lenguaje que vamos a utilizar.

`console.log('Hello Word')`

```js
console.log("Hello World");
```

```python
print('Hello World')
```

# Código HTML

Se interpreta de manera natural.

<form>
  <label for="q">Buscar:</label>
  <input type="search" name="q" id="q" required />
  <input type="submit" value="🔍" />
</form>

# Tablas

El formato estándar de tabla es el siguiente.

| Columna 1 | Columna 2 | Columna 3 |
| --------- | --------- | --------- |
| fila 1    | fila 1    | fila 1    |
| fila 2    | fila 2    | fila 2    |
| fila 3    | fila 3    | fila 3    |

# Imágenes

El método es muy similar a colocar un enlace pero añadimos un símbolo de admiración al inicio.

![Visual Studio Code](https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Visual_Studio_Code_1.35_icon.svg/2048px-Visual_Studio_Code_1.35_icon.svg.png)

![Visual Studio Code](./img/Visual_Studio_Code_1.35_icon.svg.png "Podemos añadir un texto alternativo a la imagen")

# Escapar símbolos

Se utiliza la barra inclinada inversa para escapar símbolos \.

\* Símbolo escapado \*

# Comentarios

<!-- Así es como se coloca un comentario -->

# Enlaces de interés

[Markdown Cheatsheet](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)

[Markdown JonMircha](https://jonmircha.com/markdown)

[Markdown joeicastro](https://joedicastro.com/pages/markdown.html)

