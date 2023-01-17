package Proiect.FabricaSemiconductori;

class DiodeTransistor {
    private String tip;
    private String material;
    private int V_breakdown;
    private int CurentMaxim;

    public String getType()
    {
        return tip;
    }

    public String getMaterial()
    {
        return material;
    }

    public int getV()
    {
        return V_breakdown;
    }

    public int getCurent()
    {
        return CurentMaxim;
    }

    private DiodeTransistor(Builder builder) {
        this.tip = builder.tip;
        this.material = builder.material;
        this.V_breakdown = builder.V_breakdown;
        this.CurentMaxim = builder.CurentMaxim;
    }

    public static class Builder {
        private String tip;
        private String material;
        private int V_breakdown;
        private int CurentMaxim;

        public Builder(String tip) {
            this.tip = tip;
        }

        public Builder material(String material) {
            this.material = material;
            return this;
        }

        public Builder breakdownVoltage(int V_breakdown) {
            this.V_breakdown = V_breakdown;
            return this;
        }

        public Builder maxCurrent(int CurentMaxim) {
            this.CurentMaxim = CurentMaxim;
            return this;
        }

        public DiodeTransistor build() {
            return new DiodeTransistor(this);
        }
    }
}
