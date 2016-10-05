conj(jugadores) => vector(tupla<id, tupla<estaConect, sanciones, posicion, conjuntoLineal(tupla<tipoPokemon, cantidad>), it(a id en heap)>>)
																			//con it							//este puntero lleva al heap
																												//del poke cercano
conj(expulsados) => vector(id)
								//este cant es de poke de ese tipo
conj(Pokemons) => diccTrie(tipo, tupla<cant, conjuntoLineal(tupla<coord, cantMovCapt, heap(id)>)>)) 
						//representa todos los pokes: 			//el heap debe estar
						//si no hay salvajes, su conjuntoLineal	//ordenado por la
						//de coord está vacío					//cant de pokes de las id

posPokemonesCercano => matriz(coord)