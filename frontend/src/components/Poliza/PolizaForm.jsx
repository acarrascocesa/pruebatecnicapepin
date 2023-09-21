import './poliza.css';
import { useState } from "react";
import { createPoliza } from "../../api/poliza";

const PolizaForm = () => {
  const [clienteId, setClienteId] = useState("");

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      const newPoliza = {
        cliente: { id: clienteId },
        vehiculos: [] 
      };

      await createPoliza(newPoliza);
      alert("Póliza agregada con éxito!");
    } catch (err) {
      alert("Hubo un error al agregar la póliza");
    }
  };

  return (
    <form onSubmit={handleSubmit}>
      <p>Agrega el ID del cliente</p>
      <label>
        Cliente ID:
        <input
          value={clienteId}
          onChange={(e) => setClienteId(e.target.value)}
          type="text"
          required
        />
      </label>

      <div>
        <button type="submit">Agregar Póliza</button>
      </div>
    </form>
  );
};

export default PolizaForm;
