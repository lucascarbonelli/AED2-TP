//conj(jugadores) => vector(tupla<id, tupla<estaConect, sanciones, posicion, conjuntoLineal(tupla<tipoPokemon, cantidad>), it(a id en heap)>>)
_______________________________________________								//con it							//este it lleva al heap
																												//del poke cercano

Op1:
jugadores => vector(it(infoJug))
//si está expulsado, o no está agregado, apunta a NULL
infoJug:
estaConect bool
sanciones nat
posicion coord
it pokemons
it(colaPrioridad)

//estas dos son para saber posiciones y adyacencias
matrizJugadores => it matrizJ(nat)
//donde los nat son la cant de jug que hay ahi

Op2:
jugAccRapido => vector(it(coord))
//coord de la matrizJ
//si está expulsado, o no está agregado, apunta a NULL
infoJug:
estaConect bool
sanciones nat
posicion coord
it pokemons
it(colaPrioridad)

//estas dos son para saber posiciones y adyacencias. Las como el mapa
matrizJugadores => it matrizJ(it(infoJug))

Op3:
jugadores => vector(it(infoJug))
//coord de la matrizJ
//si está expulsado, o no está agregado, apunta a NULL
infoJug:
estaConect bool
sanciones nat
it conj(id) //relacionar estaConect con esto
it pokemons
it(colaPrioridad)

//estas dos son para saber posiciones y adyacencias. Las como el mapa
matrizJugadores => it matrizJ(conj(id))
//true si está, false si no

__________

matrizPokemons => matriz(bool)
//donde true si hay un poke, false sino

pokemons => it conjuntoLineal(tupla<tipoPokemon, cant>)
//de un jugador

expulsados => conjuntoLineal(id)

posPokemons => dicc(coord, it pokemonsTotales)
//si agregamos un poke, es agregar coord a este dicc, que es O(1)

pokemonsTotales => diccTrie(tipo, it(infoPoke))
//acá están los PS y PC
infoPoke:
cant
conjuntoLineal(it(infoCoord))
//si hay algun tipo que no este en el mapa, o el conj es vacio o el it va a NULL (decidir)
infoCoord:
coord
cantMovCapt
colaPrioridad

cantidadPokeTot => nat

_______________________________________________
/*
conj(Pokemons) => diccTrie(tipo, it)
							//it a la tupla correcta del conj de abajo
posConPokes => conjuntoLineal(tupla<cant, conjuntoLineal(tupla<coord, cantMovCapt, heap(id)>)>)
									//cant total de pokes (ps y pc), si el tipo es solo pc, su conj es vacio
posPokemonesCercano => matriz(coord)

__________

mapa => matriz(matriz(bool))
//para ver si una coord P está conectada con otra Q, voy a la coord P, me lleva con un it a una matriz igual, pero de bool, y veo
//si Q está en true o false. En rep, va a tener que contemplarse que P está con Q como que Q está con P.



conj(Pokemons) => diccTrie(tipo, tupla<cant, conjuntoLineal(tupla<coord, cantMovCapt, heap(id)>)>)) 
						//representa todos los pokes: 			//el heap debe estar
						//si no hay salvajes, su conjuntoLineal	//ordenado por la
						//de coord está vacío					//cant de pokes de las id
*/

vector está, conjuntoLineal está, it de conjuntoLineal está
HACER:
·matriz
·diccTrie
·it a id (de heap)
·heap