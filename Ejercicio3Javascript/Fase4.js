var ciudades = ['Barcelona', 'Valencia', 'Malaga', 'Cadiz'];

var ciudad1 = new Array (ciudades[0].length);
var ciudad2 = new Array (ciudades[1].length);
var ciudad3 = new Array (ciudades[2].length);
var ciudad4 = new Array (ciudades[3].length);

for (let i = ciudades[0].length - 1; i >= 0; i--) {
  ciudad1[i] = ciudades[0].charAt (i);
  console.log (ciudad1[i]);
}

for (let i = ciudades[1].length - 1; i >= 0; i--) {
  ciudad2[i] = ciudades[1].charAt (i);
  console.log (ciudad2[i]);
}

for (let i = ciudades[2].length - 1; i >= 0; i--) {
  ciudad3[i] = ciudades[2].charAt (i);
  console.log (ciudad3[i]);
}

for (let i = ciudades[3].length - 1; i >= 0; i--) {
  ciudad4[i] = ciudades[3].charAt (i);
  console.log (ciudad4[i]);
}
