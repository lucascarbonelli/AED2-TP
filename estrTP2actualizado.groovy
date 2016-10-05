conj(jugadores) => vector(tupla<id, tupla<estaConect, sanciones, posicion, conjuntoLineal(tupla<tipoPokemon, cantidad>), it(a id en heap)>>)
																			//con it							//este puntero lleva al heap
																												//del poke cercano
conj(expulsados) => vector(id)

conj(Pokemons) => diccTrie(tipo, it)
							//it a la tupla correcta del conj de abajo
posConPokes => conjuntoLineal(tupla<cant, conjuntoLineal(tupla<coord, cantMovCapt, heap(id)>)>)
									//cant total de pokes (ps y pc), si el tipo es solo pc, su conj es vacio
posPokemonesCercano => matriz(coord)

__________

mapa => matriz(matriz(bool))
//para ver si una coord P está conectada con otra Q, voy a la coord P, me lleva con un puntero a una matriz igual, pero de bool, y veo
//si Q está en true o false. En rep, va a tener que contemplarse que P está con Q como que Q está con P.


/*
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