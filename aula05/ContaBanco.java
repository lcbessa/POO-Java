package aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("Conta: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + getStatus());
        System.out.println();
    };

    public void abrirConta(String tipo) {
        setTipo(tipo);
        setStatus(true);

        if (getTipo() == "CC") {
            setSaldo(50);
        } else if (getTipo() == "CP") {
            setSaldo(150);
        }
    };

    public void fecharConta() {
        if (getSaldo() < 0) {
            System.out.println("onta não pode ser fechada pois ainda tem débito!");
        } else if (getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada pois ainda tem dinheiro!");
        } else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    };

    public void depositar(float valor) {
        if (getStatus()) {
            setSaldo(getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso na conta do" + getDono() + "!");
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    };

    public void sacar(float valor) {
        if (getStatus()) {
            if (getSaldo() >= valor) {
                setSaldo(getSaldo() - valor);
                System.out.println("Saque realizado com sucesso na conta do" + getDono() + "!");

            } else {
                System.out.println("Saldo Insuficiente para saque!");
            }
        } else {
            System.out.println("Impossível sacar em conta fechada!");
        }
    };

    public void pagarMensal() {
        float v = 0;
        if (tipo == "CC") {
            v = 12;
        } else if (tipo == "CP") {
            v = 20;
        }

        if (getStatus()) {
            if (getSaldo() > v) {
                setSaldo(getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso na conta do" + getDono() + "!");
            } else {
                System.out.println("Saldo insuficente!");
            }
        } else {
            System.out.println("Impossível pagar em um conta fechada!");
        }
    };

    public ContaBanco() {
        this.status = false;
        this.saldo = 0;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}