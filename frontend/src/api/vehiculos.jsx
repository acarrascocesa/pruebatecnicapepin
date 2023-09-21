import axios from "axios";

const BASE_URL = "http://localhost:8080";
const VEHICULO_ENDPOINT = `${BASE_URL}/api/vehiculos`;

export const getAllVehiculos = async () => {
  try {
    const response = await axios.get(VEHICULO_ENDPOINT);
    return response.data;
  } catch (error) {
    throw new Error("Error fetching vehiculos:", error);
  }
};

export const getVehiculoById = async (id) => {
  try {
    const response = await axios.get(`${VEHICULO_ENDPOINT}/${id}`);
    return response.data;
  } catch (error) {
    throw new Error("Error fetching vehiculo by ID:", error);
  }
};

export const createVehiculo = async (vehiculoData) => {
  try {
    const response = await axios.post(VEHICULO_ENDPOINT, vehiculoData);
    return response.data;
  } catch (error) {
    throw new Error("Error creating vehiculo:", error);
  }
};

export const updateVehiculo = async (id, updatedVehiculo) => {
  try {
    const response = await axios.put(`${VEHICULO_ENDPOINT}/${id}`, updatedVehiculo);
    return response.data;
  } catch (error) {
    throw new Error("Error updating vehiculo:", error);
  }
};

export const deleteVehiculo = async (id) => {
  try {
    await axios.delete(`${VEHICULO_ENDPOINT}/${id}`);
  } catch (error) {
    throw new Error("Error deleting vehiculo:", error);
  }
};
