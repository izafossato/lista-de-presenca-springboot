@Entity
public class Chamada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataHoraInicio;

    @ManyToMany
    private List<Aluno> alunos;

    public Chamada() {
        // Inicializa a lista de alunos
        this.alunos = new ArrayList<>();
    }
}
