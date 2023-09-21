/* eslint-disable react/prop-types */
import './poliza.css';

const PolizaItem = ({ poliza  }) => {
  console.log(poliza);
  return (
    <div className="poliza-container">
      <div className="poliza-header">
        <h2>Poliza ID: {poliza.id}</h2>
      </div>
      <p className="cliente-name">Nombre del Cliente: {poliza.cliente.nombre}</p>
      <div className="vehiculos-container">
        Vehículos:
        <ul>
          {poliza.vehiculos.map((vehiculo, index) => (
            <li key={index} className="vehiculo-item">
              {vehiculo.marca} - {vehiculo.modelo}
            </li>
          ))}
        </ul>
      </div>
    </div>
  );
};

export default PolizaItem;

