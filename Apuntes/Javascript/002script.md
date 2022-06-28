# Script

Se puede colocar en el head entre dos etiquetas de script(no recomendado).
  
```html
<script>
  console.log('Hello World')
</script>
```

También es posible referenciarla de manera externa a otro archivo o enlace externo. Puede colocarse en el head o antes de la etiqueta de cierre del body. En el caso de colocarla en el head es necesario añadir el atributo defer(espera a la carga del documento).

```html
<script src='main.js' defer></script>
```

## Existe la etiqueta noscript

Existe para casos en los que el navegador del usuario no tenga el javascript activado. Se suele añadir un mensaje.

```html
<noscript>
  <h2>Javascript Desactivado</h2>
</noscript>
```
