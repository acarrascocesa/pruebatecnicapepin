import { useState, useEffect } from "react";
import { getAllPolizas } from "../../api/poliza";
import PolizaItem from "./PolizaItem";

const PolizaList = () => {
  const [polizas, setPolizas] = useState([]);

  useEffect(() => {
    async function getPolizas() {
      const data = await getAllPolizas();
      setPolizas(data);
    }
    getPolizas();
  }, []);


  return (
    <div>
      {polizas.map((poliza, index) => (
        <PolizaItem
          key={index}
          poliza={poliza}
        />
      ))}
    </div>
  );
};

export default PolizaList;
