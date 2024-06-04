window.onload = function() {
    listarInmuebles();
}

let listarInmuebles = async () => {
    try {
        const peticion = await fetch("/api/inventario",
        {
            method: "GET",
            headers: {
                "Accept": "application/json",
                "Content-Type": "application/json",
            }
        });

        if (!peticion.ok) {
            throw new Error(`Error en la petición: ${peticion.statusText}`);
        }

        const inmuebles = await peticion.json();

        let contenidoTabla = "";

        for (let inm of inmuebles) {
            let contenidoFila = ` <tr>
                <td>${inm.consecutivo}</td>
                <td>${inm.propietario}</td>
                <td>${inm.matricula}</td>
                <td>${inm.tipo}</td>
                <td>${inm.fecha}</td>
                <td>${inm.prop_anterior}</td>
                <td>${inm.pais}</td>
            </tr>`;

            contenidoTabla += contenidoFila;
        }

        document.querySelector("#tabla tbody").outerHTML = contenidoTabla;
    } catch (error) {
        console.error("Error:", error);
    }
}
