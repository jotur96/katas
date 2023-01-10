
function wrapping(gifts) {
    return gifts.map(function(gift){
      let wrapper = "*".repeat(gift.length+2)
      return wrapper+"\n*"+gift+"*\n"+wrapper
    })    
  }
  
  const gifts = ['cat', 'game', 'socks']
  const wrapped = wrapping(gifts)
  
  console.log(wrapped)



// Reto N1

// Algoritmo de Envoltorio de Regalos
// Este año, los elfos han comprado una máquina que envuelve regalos. Pero... ¡no viene programada! Necesitamos crear un algoritmo que le ayudará en esta tarea.

// La máquina toma un array de regalos, donde cada regalo es un string. Necesitamos que la máquina envuelva cada regalo en papel de regalo y lo coloque en un array de regalos envueltos.

// El papel de regalo se representa con el símbolo * y para envolver un regalo, el símbolo * se coloca de manera que rodea completamente al string por todos los lados. Por ejemplo:

// Copy code
// const gifts = ['cat', 'game', 'socks']
// const wrapped = wrapping(gifts)

// console.log(wrapped)
// /* [
//   "*****\n*cat*\n*****",
//   "******\n*game*\n******",
//   "*******\n*socks*\n*******"
// ] */
// Como puedes ver, el papel de regalo rodea el string. Por arriba y por abajo, sin dejar ningún hueco, las esquinas también están cubiertas por el papel de regalo.

// Nota: El carácter \n representa un salto de línea.

// Atención: Asegúrate de utilizar el número correcto de * para envolver completamente el string. Pero no demasiados. Sólo los necesarios para cubrir el string.

// Oh, y no modifiques el array original.