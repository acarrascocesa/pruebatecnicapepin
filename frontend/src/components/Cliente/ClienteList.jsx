
import { useState, useEffect } from "react";
import { getAllClientes } from "../../api/cliente";
import ClienteItem from "./ClienteItem";

const ClienteList = () => {
  const [clientes, setClientes] = useState([]);

  useEffect(() => {
    const fetchClientes = async () => {
      const data = await getAllClientes();
      setClientes(data);
    };

    fetchClientes();
  }, []);

  console.log(clientes);

  return (
    <div>
      {clientes.map((cliente, index) => (
        <ClienteItem key={index} cliente={cliente} />
      ))}
    </div>
  );
};

export default ClienteList;
