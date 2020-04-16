var citys = ['Barcelona', 'Valencia', 'Malaga', 'Cadiz'];

for (let i = 0; i < citys.length; i++) {
  citys[i] = citys[i].replace (/a/gi, 4);
}
console.log (citys);
