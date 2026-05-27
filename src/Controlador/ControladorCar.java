package Controlador;
import DAO.CarDao;
import Modelos.Car;
import java.util.List;

public class ControladorCar {

    private CarDao carDao;

    public ControladorCar() {
        this.carDao = new CarDao();
    }

    public List<Car> listarCarros() {
        return carDao.listar();
    }

    public boolean insertarCarro(String marca, String modelo, String color,
                                  int year, String placa, int costo, String estado) {
        Car c = new Car();
        c.setMarca(marca);
        c.setModelo(modelo);
        c.setColor(color);
        c.setYear(year);
        c.setPlaca(placa);
        c.setCosto(costo);
        c.setEstado(estado);
        return carDao.agregar(c) == 1;
    }

    public boolean actualizarCarro(int id, String marca, String modelo, String color,
                                    int year, String placa, int costo, String estado) {
        Car c = new Car();
        c.setVehi_id(id);
        c.setMarca(marca);
        c.setModelo(modelo);
        c.setColor(color);
        c.setYear(year);
        c.setPlaca(placa);
        c.setCosto(costo);
        c.setEstado(estado);
        return carDao.actualizar(c) == 1;
    }

    public boolean eliminarCarro(int id) {
        return carDao.eliminar(id) == 1;
    }
}