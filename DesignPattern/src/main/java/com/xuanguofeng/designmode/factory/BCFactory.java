package com.xuanguofeng.designmode.factory;

/**
 * description:奔驰工厂
 * created time: 2018/2/5 11:46
 *
 * @author xuanguofeng
 */

class BCFactory extends Factory {

    @Override
    GLACar createGLA() {
        return new GLACar();
    }

    @Override
    <T extends BenChiCar> T createCar(Class<T> clazz) {
        BenChiCar benChiCar = null;
        try {
            benChiCar = (BenChiCar) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return (T) benChiCar;
    }
}
